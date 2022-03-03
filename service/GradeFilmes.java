package ProxyPattern.service;

import ProxyPattern.model.Filme;

public class GradeFilmes implements InterfaceGradeFilmes {

    @Override
    public Filme getFilme(String titulo) {
        Filme filme = switch (titulo) {
            case "1917" -> new Filme("1917", "Brasil", "https://www.imdb.com/title/tt8579674/");
            case "Ratatouille" -> new Filme("Ratatouille", "Argentina", "https://www.imdb.com/title/tt0382932/?ref_=nv_sr_srsg_0");
            case "The Irishman" -> new Filme("The Irishman", "Colombia", "https://www.imdb.com/title/tt1302006/");
            default -> null;
        };
        return filme;
    }

}
