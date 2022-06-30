import java.util.Arrays;

public class Block {
    private int pHash;
    private String[] transactions;
    private int blockHash;

    //Block constructor
    public Block(int pHash, String[] transactions)
    {
        this.pHash=pHash;
        this.transactions=transactions;

        Object[] contents ={Arrays.hashCode(transactions),pHash};
        this.blockHash= Arrays.hashCode(contents);
    }

    public int getpHash()
    {

        return pHash;
    }

    public String[] getTransaction() {

        return transactions;
    }

    public int getBlockHash(){
        return blockHash;
    }
}
