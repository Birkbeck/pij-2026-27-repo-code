void main() {
    SpySolution alice = new SpySolution(5);
    SpySolution bob = new SpySolution(6);
    IO.println("There are " + SpySolution.getNumberOfActiveSpies() + " active spies!");
    bob.retire();
    IO.println("There are " + SpySolution.getNumberOfActiveSpies() + " active spies!");
}
