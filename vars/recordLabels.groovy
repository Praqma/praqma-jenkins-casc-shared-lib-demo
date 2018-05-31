def list(String nodeName = "master") {
    def currentNode = Jenkins.instance.getNode(nodeName)
    echo "Found current node: $currentNode"
    def labelAtoms = currentNode.getLabels()
    return "hehe"
}