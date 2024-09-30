package com.stardevllc.units;

public enum MemoryUnit {
    BYTE(1, "b", "bytes"), 
    KILOBYTE(1024, "kb", "kilobytes"),
    MEGABYTE(1048576, "mb", "megabytes"),
    GIGABYTE(1073741824, "gb", "gigabytes"),
    TERABYTE(1099511627776L, "tb", "terabytes"),
    PETABYTE(1125899906842624L, "pb", "petabytes");
    
    private final long amountInBytes;
    private final String[] aliases;

    MemoryUnit(long amountInBytes, String... aliases) {
        this.amountInBytes = amountInBytes;
        this.aliases = aliases;
    }

    public long getAmountInBytes() {
        return amountInBytes;
    }

    public String[] getAliases() {
        return aliases;
    }
    
    public long toBytes(long amount) {
        return amountInBytes * amount;
    }
    
    public double toKilobytes(long amount) {
        return (amountInBytes * amount * 1.0) / KILOBYTE.getAmountInBytes();
    }
    
    public double toMegabytes(long amount) {
        return (amountInBytes * amount * 1.0) / MEGABYTE.getAmountInBytes();
    }
    
    public double toGigabytes(long amount) {
        return (amountInBytes * amount * 1.0) / GIGABYTE.getAmountInBytes();
    }
    
    public double toTerabytes(long amount) {
        return (amountInBytes * amount * 1.0) / TERABYTE.getAmountInBytes();
    }
    
    public double toPetabytes(long amount) {
        return (amountInBytes * amount * 1.0) / PETABYTE.getAmountInBytes();
    }
}
