package org.foo.utils

public void netTemplate(body) {
  podTemplate(
        containers: [containerTemplate(name: 'net', image: 'agent-windows:latest')]) {
    body.call()
}
}

public void mavenTemplate(body) {
  podTemplate(
        containers: [containerTemplate(name: 'maven', image: 'agent:2')]) {
    body.call()
}
}

return this
