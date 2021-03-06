package entities;

import static main.Main.PAGE_TABLE_FALSE;
import static main.Main.PAGE_TABLE_TRUE;

public class PageTableEntry {
    private final Page page;
    private boolean isModified;
    private boolean isPresent;
    private int lastAccessTime;
    private int frameNumber;

    public PageTableEntry() {
        isModified = false;
        isPresent = false;
        lastAccessTime = -1;
        frameNumber = 0;
        page = null;
    }

    public PageTableEntry(Page page) {
        isModified = false;
        isPresent = false;
        lastAccessTime = -1;
        this.page = page;
    }

    public boolean isModified() {
        return isModified;
    }

    public void setModified(boolean modified) {
        isModified = modified;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    public int getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(int lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public int getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }

    public Page getPage() {
        return page;
    }

    @Override
    public String toString() {
        return "\n Entry{" +
                "isModified=" + isModified +
                ", isPresent=" + isPresent +
                ", lastAccessTime=" + lastAccessTime +
                ", frameNumber=" + frameNumber +
                ", page=" + page +
                '}';
    }

    public String getIsPresentString() {
        if (isPresent) {
            return PAGE_TABLE_TRUE;
        } else {
            return PAGE_TABLE_FALSE;
        }
    }

    public String getIsModifiedString() {
        if (isModified) {
            return PAGE_TABLE_TRUE;
        } else {
            return PAGE_TABLE_FALSE;
        }
    }
}
