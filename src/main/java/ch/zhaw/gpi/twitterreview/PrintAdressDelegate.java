/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.zhaw.gpi.twitterreview;

import java.util.Map;
import javax.inject.Named;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

/**
 *
 * @author Janick Michot
 */
@Named("printAdress")
public class PrintAdressDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution de) throws Exception {
        System.out.println("===");
        Map<String, Object> camundaVariables = de.getVariables();
        for(String key : camundaVariables.keySet()) {
            System.out.println("CammundaVariables["+ key + "] = " + camundaVariables.get(key));
        }
    }
}
