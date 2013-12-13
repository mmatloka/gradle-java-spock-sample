import spock.lang.Specification
import spock.lang.Unroll

class HelloSpock extends Specification {

    @Unroll
    def "length #name #length"() {
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
    }

    @Unroll
    def "say hello: #name #result"() {
        setup:
        def greeter = new Greeter()

        when:
        def greeting = greeter.sayHello(name)

        then:
        result == greeting

        where:
        name    | result
        "Spock" | "Hello Spock"
        "Kirk"  | "Hello Kirk"
    }
}
