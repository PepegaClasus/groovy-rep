import groovy.util.*
import java.util.*

properties([
    buildDiscarder(logRotator(artifactDaysToKeepStr: '5', artifactNumToKeepStr: '5', daysToKeepStr: '20', numToKeepStr: '20')),
    durabilityHint('PERFORMANCE_OPTIMIZED')
    parameters ([
        string(name: 'text', defaultValue: 'TestText')
    ])

])