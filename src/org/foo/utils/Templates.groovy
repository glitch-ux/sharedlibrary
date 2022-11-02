package org.foo.utils

public void netTemplate(body) {
  podTemplate(
        containers: [containerTemplate(name: 'net', image: 'agent-windows:latest', command: 'sleep', args: '99d')]) {
    body.call()
}
}

public void mavenTemplate(body) {
  podTemplate(
        containers: [containerTemplate(name: 'maven', image: 'agent:2', command: 'sleep', args: '99d')]) {
    body.call()
}
}

return this
