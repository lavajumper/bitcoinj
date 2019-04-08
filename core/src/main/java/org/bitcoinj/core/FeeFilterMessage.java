package org.bitcoinj.core;

/**
 * <p>
 * A new message, "feefilter",
 * </p>
 *
 * <p>
 * See <a href="https://github.com/bitcoin/bips/blob/master/bip-0130.mediawiki">BIP 130</a>.
 * </p>
 */
public class FeeFilterMessage extends EmptyMessage {
    public FeeFilterMessage() {
    }

    // this is needed by the BitcoinSerializer
    public FeeFilterMessage(NetworkParameters params, byte[] payload) {
    }
}
