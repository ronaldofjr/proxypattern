package ProxyPattern.service;

import ProxyPattern.exceptions.SerieNaoHabilitadaException;

public class SeriesProxy implements InterfaceSeries {
    private int qtdViews = 0;

    public int getQtdViews() {
        return qtdViews;
    }

    public void setQtdViews(int qtdViews) {
        this.qtdViews = qtdViews;
    }

    @Override
    public String getSerie(String titulo) throws SerieNaoHabilitadaException {
        Series series = new Series();
        if (getQtdViews() >= 5) {
            throw new SerieNaoHabilitadaException("O número de reproduções permitidas foi ultrapassado!");
        } else {
            setQtdViews(getQtdViews() + 1);
            return series.getSerie(titulo);
        }
    }
}
