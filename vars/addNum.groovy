import org.avijit.Calc

def call(int a, int b) {
    def cal= new Calc()
    def result = cal.add(a,b)
    return result
}
