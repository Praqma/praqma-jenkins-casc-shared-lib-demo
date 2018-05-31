def list(String nodeName = "master") {
    echo "Using nodeName as: '$nodeName'"
    def currentNode = Jenkins.instance.getNode(nodeName)
    echo "Found current node: $currentNode"
    def labelAtoms = currentNode.getLabels()
    return "hehe"
}