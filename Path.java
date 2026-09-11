import java.util.*;

class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        String[] parts = path.split("/");

        for (String part : parts) {

            // Empty part or current directory
            if (part.equals("") || part.equals(".")) {
                continue;
            }

            // Parent directory
            else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }

            // Normal directory
            else {
                stack.push(part);
            }
        }

        // Build answer
        StringBuilder result = new StringBuilder();

        for (String folder : stack) {
            result.append("/").append(folder);
        }

        // If stack is empty
        if (result.length() == 0) {
            return "/";
        }

        return result.toString();
    }
}
