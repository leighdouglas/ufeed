package nyc.c4q.leighdouglas.ufeed.model;

/**
 * Created by mathcore on 11/19/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class TopTrack {

    @SerializedName("items")
    @Expose
    private List<Item> items = new ArrayList<Item>();
    @SerializedName("total")
    @Expose
    private int total;
    @SerializedName("limit")
    @Expose
    private int limit;
    @SerializedName("offset")
    @Expose
    private int offset;
    @SerializedName("previous")
    @Expose
    private String previous;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("next")
    @Expose
    private String next;

    /**
     *
     * @return
     * The items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     *
     * @param items
     * The items
     */
    public void setItems(List<Item> items) {
        this.items = items;
    }

    /**
     *
     * @return
     * The total
     */
    public int getTotal() {
        return total;
    }

    /**
     *
     * @param total
     * The total
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     *
     * @return
     * The limit
     */
    public int getLimit() {
        return limit;
    }

    /**
     *
     * @param limit
     * The limit
     */
    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     *
     * @return
     * The offset
     */
    public int getOffset() {
        return offset;
    }

    /**
     *
     * @param offset
     * The offset
     */
    public void setOffset(int offset) {
        this.offset = offset;
    }

    /**
     *
     * @return
     * The previous
     */
    public String getPrevious() {
        return previous;
    }

    /**
     *
     * @param previous
     * The previous
     */
    public void setPrevious(String previous) {
        this.previous = previous;
    }

    /**
     *
     * @return
     * The href
     */
    public String getHref() {
        return href;
    }

    /**
     *
     * @param href
     * The href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     *
     * @return
     * The next
     */
    public String getNext() {
        return next;
    }

    /**
     *
     * @param next
     * The next
     */
    public void setNext(String next) {
        this.next = next;
    }

}
