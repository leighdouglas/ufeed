package nyc.c4q.leighdouglas.ufeed.model;

/**
 * Created by mathcore on 11/19/16.
 */

import java.util.ArrayList;
import java.util.List;

import kaaes.spotify.webapi.android.models.Image;


public class Album {

    private String albumType;
    private ExternalUrls externalUrls;
    private String href;
    private String id;
    private List<Image> images = new ArrayList<Image>();
    private String name;
    private String type;
    private String uri;

    /**
     *
     * @return
     * The albumType
     */
    public String getAlbumType() {
        return albumType;
    }

    /**
     *
     * @param albumType
     * The album_type
     */
    public void setAlbumType(String albumType) {
        this.albumType = albumType;
    }

    /**
     *
     * @return
     * The externalUrls
     */
    public ExternalUrls getExternalUrls() {
        return externalUrls;
    }

    /**
     *
     * @param externalUrls
     * The external_urls
     */
    public void setExternalUrls(ExternalUrls externalUrls) {
        this.externalUrls = externalUrls;
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
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     *
     * @param images
     * The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The uri
     */
    public String getUri() {
        return uri;
    }

    /**
     *
     * @param uri
     * The uri
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

}
