---
maintainer: MadsNielsen
---

# praqma-jenkins-casc-shared-lib-demo

A repository with a couple of shared library functions used for demonstrating https://github.com/jenkinsci/configuration-as-code-plugin

Basically this lib can generate a console message that act's as a fake warning to be picked up by Jenkins. 

If you include it, you can generate a random warning, with a random line number using the following command:

``` 
@Library('demo-lib@master') _

warningLib.create("Something went wrong")
```
That's basically it. For demonstration purposes.
