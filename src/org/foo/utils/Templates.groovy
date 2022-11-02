package src.org.foo.utils

public void netTemplate(body) {
  podTemplate(
        containers: [containerTemplate(name: 'net', image: 'agent-windows:latest')],
        volumes: [hostPathVolume(hostPath: '//var/run/docker.sock', mountPath: '/var/run/docker.sock')]) {
    body.call()
}
}

public void mavenTemplate(body) {
  podTemplate(
        containers: [containerTemplate(name: 'maven', image: 'agent:2')],
         volumes: [hostPathVolume(hostPath: '//var/run/docker.sock', mountPath: '/var/run/docker.sock')]) {
    body.call()
}
}

return this
