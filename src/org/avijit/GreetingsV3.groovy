package org.avijit
import org.avijit.Quotes

class GreetingsV3 {

    static def greet(Object script, String msg) {
        def quote =  new Quotes()
        script.echo "GreetingV3: ${msg}"
        script.echo "Quotes:" + quote.generate()
    }

}
