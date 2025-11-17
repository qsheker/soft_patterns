package Strategy.concrete;

import Strategy.CompressStrategy;

public class RARCompress implements CompressStrategy {
    @Override
    public String compress(String filePath) {
        return "compressing file in path: "+filePath+" into .rar...";
    }
}
