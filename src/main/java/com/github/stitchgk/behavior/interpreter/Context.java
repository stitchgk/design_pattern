package com.github.stitchgk.behavior.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author: jiaofanghao
 * @time: 2026/6/22
 **/
public class Context {

    private final StringTokenizer tokenizer;
    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(normalize(text));
        nextToken();
    }

    public String nextToken() {
        if (tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken();
        } else {
            currentToken = null;
        }
        return currentToken;
    }

    public String currentToken() {
        return currentToken;
    }

    public void skipToken(String token) {
        if (!token.equals(currentToken)) {
            throw new IllegalArgumentException("错误的标记: " + currentToken + ", 期望标记: " + token);
        }
        nextToken();
    }

    public int currentNumber() {
        if (currentToken == null) {
            throw new IllegalArgumentException("当前标记为空, 无法解析数字");
        }
        return Integer.parseInt(currentToken);
    }

    private String normalize(String text) {
        List<String> tokens = new ArrayList<>();
        for (String token : text.split("\\s+")) {
            parseToken(token, tokens);
        }
        return String.join(" ", tokens);
    }

    private void parseToken(String token, List<String> tokens) {
        if (token == null || token.length() == 0) {
            return;
        }
        if (token.startsWith("PRINT")) {
            tokens.add("PRINT");
            parsePrintText(token.substring("PRINT".length()), tokens);
            return;
        }
        tokens.add(token);
    }

    private void parsePrintText(String text, List<String> tokens) {
        if (text.length() == 0) {
            return;
        }

        int keywordIndex = firstKeywordIndex(text);
        if (keywordIndex < 0) {
            tokens.add(text);
            return;
        }
        if (keywordIndex > 0) {
            tokens.add(text.substring(0, keywordIndex));
        }
        parseToken(text.substring(keywordIndex), tokens);
    }

    private int firstKeywordIndex(String text) {
        int index = -1;
        for (String keyword : new String[]{"LOOP", "PRINT", "SPACE", "BREAK", "END"}) {
            int keywordIndex = text.indexOf(keyword);
            if (keywordIndex >= 0 && (index < 0 || keywordIndex < index)) {
                index = keywordIndex;
            }
        }
        return index;
    }
}
