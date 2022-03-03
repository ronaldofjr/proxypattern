package ProxyPattern.service;

public class Series implements InterfaceSeries {

    @Override
    public String getSerie(String titulo) {
        return "Link para \"" + titulo + "\": www." + titulo.replace(" ", "").toLowerCase() + ".com";
    }

}
