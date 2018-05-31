def list(nn) {
    def currentNode = Jenkins.instance.getNode(nn)
    def labelAtoms = currentNode.getLabels()
    return "hehe"
}