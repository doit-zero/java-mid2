package collection.map.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> browserStack = new ArrayDeque<>();
    private String currentPage = null;

    public void visitPage(String site) {
        if(currentPage != null){
            browserStack.push(site);
        }
        currentPage = site;
        System.out.println("방문 : " + site);
    }
    public String goBack() {
        if(!browserStack.isEmpty()){
            currentPage = browserStack.pop();
            System.out.println("뒤로 가기 " + currentPage);
            return currentPage;
        }
        return null;
    }
}
