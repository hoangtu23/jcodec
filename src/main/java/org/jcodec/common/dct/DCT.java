package org.jcodec.common.dct;

/**
 * This class is part of JCodec ( www.jcodec.org )
 * This software is distributed under FreeBSD License
 * 
 * @author The JCodec project
 *
 */
public abstract class DCT {
    public short[] encode(byte[] orig) {
        throw new UnsupportedOperationException();
    }

    public abstract int[] decode(int[] orig);

    public void decodeAll(int[][] src) {
        for (int i = 0; i < src.length; i++) {
            src[i] = decode(src[i]);
        }
    }

}
