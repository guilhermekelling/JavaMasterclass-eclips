/*
 * @author: Guilherme Ruschel Kelling 
 *  
 * 
 */

package Section9_AbstractClassChallenge;


public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
