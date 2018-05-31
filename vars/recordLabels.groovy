def list(String nodeName = "master") {
    echo "Using nodeName as: '$nodeName'"
    echo "Jenkins instance is not null: ${Jenkins.instance != null}"
    def currentNode = Jenkins.instance.getNode(nodeName)
    echo "Found current node: $currentNode"
    def labelAtoms = currentNode.getAssignedLabels()
    for(label l in labelAtoms) {
        echo "$l"
    }
    return "hehe"
}