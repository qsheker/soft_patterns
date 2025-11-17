package Strategy;

import Strategy.concrete.RARCompress;
import Strategy.concrete.TARCompress;
import Strategy.concrete.ZIPCompress;

public class Runner {
    public static void main(String[] args) {
        String filePath = "some-path";
        CompressStrategy tarCompressor = new TARCompress();
        CompressStrategy rarCompressor = new RARCompress();
        CompressStrategy zipCompressor = new ZIPCompress();


        System.out.println(tarCompressor.compress(filePath));
        System.out.println(zipCompressor.compress(filePath));
        System.out.println(rarCompressor.compress(filePath));
    }
}
