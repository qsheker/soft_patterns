package Strategy.concrete;

import Strategy.CompressStrategy;

public class ZIPCompress implements CompressStrategy {
    @Override
    public String compress(String filePath) {
        return "compressing file in path: "+filePath+" into .zip...";
    }
}
