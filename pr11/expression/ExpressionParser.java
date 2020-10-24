package pr11.expression;

import pr11.expression.operations.*;

import java.text.ParseException;
import java.util.HashMap;
import java.util.regex.*;

public class ExpressionParser {
    static private final Pattern pHooks = Pattern.compile("\\(([\\d\\s\\*\\+\\-/^%_a-z]*)\\)");
    static private final Pattern pNum = Pattern.compile("\\d+|[a-z]+|_expr\\d+");
    static private final Pattern pUnirMinusNum = Pattern.compile("-(" + pNum + ")");
    static private final Pattern hHighPriority = Pattern.compile("[\\*/^%]");
    static private final Pattern hLowPriority = Pattern.compile("[\\+\\-]");
    static private final Pattern mHighPriority = Pattern.compile("(" + pNum.pattern() + ")\\s*(" + hHighPriority.pattern() + ")\\s*(" + pNum.pattern() + ")");
    static private final Pattern mLowPriority = Pattern.compile("(" + pNum.pattern() + ")\\s*(" + hLowPriority.pattern() + ")\\s*(" + pNum.pattern() + ")");

    private int id = 0;
    private HashMap<String, IExpression> expressionMap = new HashMap<>();

    public void clean() {
        id = 0;
        expressionMap = new HashMap<>();
    }

    public IExpression parse(String str) throws Exception {
        Matcher matcher = pUnirMinusNum.matcher(str);
        if (matcher.find())
        {
            IExpression tbh = parse(matcher.group(1));
            expressionMap.put("_expr" + id, new UnirMinus(tbh));
            return parse(str.substring(0, matcher.start(0)) + "_expr" + id++ + str.substring(matcher.end(0)));
        }
        matcher = pHooks.matcher(str);
        if (matcher.find())
        {
            IExpression tbh = parse(matcher.group(1));
            expressionMap.put("_expr" + id, new Hooks(tbh));
            return parse(str.substring(0, matcher.start(0)) + "_expr" + id++ + str.substring(matcher.end(0)));
        }
        Matcher highMatcher = mHighPriority.matcher(str);
        Matcher lowMatcher = mLowPriority.matcher(str);
        matcher = highMatcher.find() ? highMatcher : lowMatcher.find() ? lowMatcher : null;
        if (matcher != null)
        {
            IExpression tbh = parseSimpleExpression(matcher);;
            expressionMap.put("_expr" + id, tbh);
            return parse(str.substring(0, matcher.start(0)) + "_expr" + id++ + str.substring(matcher.end(0)));
        }
        matcher = pNum.matcher(str);
        if (matcher.find()) {
            String tbh = matcher.group(0);
            if (!matcher.find())
                return parseVariable(tbh);
        }
        throw new Exception(str);
    }

    private IExpression parseSimpleExpression(MatchResult match) throws Exception {
        return switch (match.group(2)) {
            case "+" -> new Add(parseVariable(match.group(1)), parseVariable(match.group(3)));
            case "-" -> new Subtract(parseVariable(match.group(1)), parseVariable(match.group(3)));
            case "*" -> new Multiply(parseVariable(match.group(1)), parseVariable(match.group(3)));
            case "/" -> new Divide(parseVariable(match.group(1)), parseVariable(match.group(3)));
            case "%" -> new Modulo(parseVariable(match.group(1)), parseVariable(match.group(3)));
            case "^" -> new Power(parseVariable(match.group(1)), parseVariable(match.group(3)));
            default -> throw new Exception("");
        };
    }

    private IExpression parseVariable(String s) {
        try {
            if (expressionMap.containsKey(s))
                return expressionMap.get(s);
            return new Const(Integer.parseInt(s));
        }
        catch (NumberFormatException e) {
            return new Variable(s);
        }
    }

    static private final Pattern pEvaluate = Pattern.compile("(([a-z]+)\\s+(\\d+))");

    static public HashMap<String, Integer> parseEvaluate(String str) {
        System.out.println(str);
        HashMap<String, Integer> evaluateMap = new HashMap<>();
        Matcher matcher = pEvaluate.matcher(str);
        while (matcher.find())
            evaluateMap.put(matcher.group(2), Integer.parseInt(matcher.group(3)));
        return evaluateMap;
    }
}
