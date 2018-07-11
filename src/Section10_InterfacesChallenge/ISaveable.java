/*
 * @author: Guilherme Ruschel Kelling 
 *  
 * 
 */

package Section10_InterfacesChallenge;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);

}


