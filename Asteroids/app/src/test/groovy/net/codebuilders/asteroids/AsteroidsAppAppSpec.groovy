/*
 * This source file was generated by the Skeletal project creation tool.
 * https://github.com/cbmarcum/skeletal
 */
package net.codebuilders.asteroids

import spock.lang.Specification

class AsteroidsAppSpec extends Specification {
    def "application has a greeting"() {
        setup:
        def app = new AsteroidsApp()

        when:
        def result = app.greeting

        then:
        result != null
    }
}
