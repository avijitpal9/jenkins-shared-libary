import org.avijit.Quotes

def call(Map map) {
    Quotes quote = new Quotes()
    echo "Executing from wrapperQuotes"
    echo "Quotes: " + quote.generate()
}
