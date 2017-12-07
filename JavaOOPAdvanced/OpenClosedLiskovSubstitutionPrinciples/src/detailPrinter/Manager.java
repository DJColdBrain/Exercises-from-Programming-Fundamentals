package detailPrinter;

public class Manager extends Employee {

    private Iterable<String> documents;

    private Manager(String name, Iterable<String> documents) {
        super(name);
        this.documents = documents;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDocuments: "
                +this.documents.toString();
    }
}
