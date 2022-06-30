import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Main {


   // ArrayList<Block> blockchain = new ArrayList<> ();

    public static void main(String[] args) {

        //genesis block creation
        String[] genesisTransactions={"Satoshi sent Abhinav 500 bitcoins"};
        Block genesisBlock = new Block(0,genesisTransactions);

        //block2 creation
        String[] block2Transactions={"Satoshi sent John 1000 bitcoins"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        //block3 creation
        String[] block3Transaction={"Satoshi sent Ami 4 bitcoins"};
        Block block3 = new Block(block2.getBlockHash(),block3Transaction);

        String[] block4Transaction={"Satoshi sent labdhi 4 bitcoins"};
        Block block4 = new Block(block3.getBlockHash(),block4Transaction);

        System.out.println("genesis block hash : "+genesisBlock.getBlockHash());
        System.out.println("block2 hash : "+block2.getBlockHash());
        System.out.println("block3 hash : "+block3.getBlockHash());
        System.out.println("block4 hash : "+block4.getBlockHash());

    }
}
 /*
    hash = digital signature
    Each block will have:
            List of Transactions
            previous Hash
            own Hash
     */
