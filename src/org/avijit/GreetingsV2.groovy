package org.avijit
import org.avijit.Quotes

class GreetingsV2 implements Serializable {
    def steps

    GreetingsV2(steps) {
        this.steps=steps
    }
    
    def greet(String msg) {
        def quote =  new Quotes()
        steps.echo "GreetingV2: ${msg}"
        steps.echo "Quotes:" + quote.generate()
    }

}
