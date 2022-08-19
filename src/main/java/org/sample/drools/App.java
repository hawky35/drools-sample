package org.sample.drools;

import org.kie.api.KieServices;
import org.kie.api.builder.Results;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.sample.drools.model.Customer;
import org.sample.drools.model.Product;
import org.sample.drools.model.Purchase;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Bootstrapping the Rule Engine ..." );
        //1) Bootstrapping a Rule Engine Session
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        // Let's verify that all the resources are loaded correctl
        // System.out.println(kContainer.verify().getMessages().toString());
        // Let's verify that all the resources are loaded correctly
        Results results = kContainer.verify();
        // We can iterate the results
        results.getMessages().stream()
         .forEach((message) -> {
         System.out.println(">> Message ( "+message.getLevel()+" ): "
         +message.getText());
         });


        //link to the session name to kmodule.xml configuration 
        KieSession kSession = kContainer.newKieSession("ksession-rules");
        System.out.println("**************************************************");
        Customer mark = new Customer( "mark",0 );
        //2) Provide information to the Rule Engine Context
        kSession.insert( mark );
        Product shoes = new Product( "shoes",60 );
        kSession.insert( shoes );
        Product hat = new Product( "hat",60 );
        kSession.insert( hat );
        kSession.insert( new Purchase( mark,shoes ) );
        FactHandle hatPurchaseHandle = kSession.insert( new Purchase( mark,hat ) );
        kSession.fireAllRules();
        kSession.delete( hatPurchaseHandle );
        System.out.println( "Customer mark has returned the hat" );
        //3) Execute the rules that are matching
        kSession.fireAllRules();
        System.out.println( "Hello World!" );
    }
}
