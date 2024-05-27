package collection.map.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    Deque<String> browserStack = new ArrayDeque<>();

    public void visitPage(String site) {
        browserStack.push(site);
        System.out.println("방문 : " + site);
    }
    public String goBack() {
        return browserStack.pop();
    }
}
