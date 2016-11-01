package id.rahmanlathief.infonesia;

import android.widget.ImageView;

/**
 * Created by rahmanlathief on 01-Nov-16.
 */

public class Province {
    private ImageView logo;
    private String provName, provState;

    public ImageView getLogo() {
        return logo;
    }

    public void setLogo(ImageView logo) {
        this.logo = logo;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

    public String getProvState() {
        return provState;
    }

    public void setProvState(String provState) {
        this.provState = provState;
    }

    public Province(ImageView logo, String provName, String provState) {

        this.logo = logo;
        this.provName = provName;
        this.provState = provState;
    }
}
