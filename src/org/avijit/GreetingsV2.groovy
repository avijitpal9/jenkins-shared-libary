package org.avijit
import org.avijit.Quotes

class GreetingsV2 implements Serializable {
    def steps, env

    GreetingsV2(steps, env) {
        this.steps=steps
        this.env=env
    }
    
    def greet(String msg) {
        def quote =  new Quotes()
        steps.echo "GreetingV2: ${msg}"
        steps.echo "Quotes: " + quote.generate()
        steps.echo "ENV Vars: " + env.getEnvironment() // Need to approve script
    }

}
