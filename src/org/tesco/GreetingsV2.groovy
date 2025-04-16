package org.tesco
import org.tesco.Quotes

class GreetingsV2 {
    def steps

    GreetingsV2(steps) {
        this.steps=steps
    }
    
    def greet(String msg) {
        def quote =  new Quotes()
        steps.echo "GreetingV2: ${msg}"
        steps.echo quote.generate()
    }

}
