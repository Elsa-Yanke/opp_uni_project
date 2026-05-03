package university.research;

import university.enums.CitationFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class ResearchPaper implements Comparable<ResearchPaper> {

    private String paperId;
    private String title;
    private List<String> authors;
    private String journal;
    private int pages;
    private Date date;
    private String doi;
    private int citations;

    public ResearchPaper() {}

    public ResearchPaper(String paperId, String title, List<String> authors, String journal, int pages, Date date, String doi) {
        this.paperId = paperId;
        this.title = title;
        this.authors = authors;
        this.journal = journal;
        this.pages = pages;
        this.date = date;
        this.doi = doi;
        this.citations = 0;
    }

    public String getCitation(CitationFormat format) {
        if (format == CitationFormat.PLAIN_TEXT) {
            return String.join(", ", authors) + ". \"" + title + "\". " + journal + ". " + date + ". DOI: " + doi;
        } else {
            return "@article{" + paperId + ",\n" + "  title={" + title + "},\n" + "  author={" + String.join(" and ", authors) + "},\n" + "  journal={" + journal + "},\n" + "  year={" + date + "},\n" + "  doi={" + doi + "}\n" + "}";
        }
    }

    public void addCitation() {
        this.citations++;
    }

    @Override
    public int compareTo(ResearchPaper other) {
        return Integer.compare(other.citations, this.citations);
    }

    public static Comparator<ResearchPaper> byDateDesc() {
        return Comparator.comparing(ResearchPaper::getDate).reversed();
    }

    public static Comparator<ResearchPaper> byCitationsDesc() {
        return Comparator.comparingInt(ResearchPaper::getCitations).reversed();
    }

    public static Comparator<ResearchPaper> byPagesDesc() {
        return Comparator.comparingInt(ResearchPaper::getPages).reversed();
    }

    @Override
    public String toString() {
        return "ResearchPaper{title='" + title + "', citations=" + citations + ", pages=" + pages + ", journal='" + journal + "'}";
    }

    public String getPaperId() { return paperId; }
    public String getTitle() { return title; }
    public List<String> getAuthors() { return authors; }
    public String getJournal() { return journal; }
    public int getPages() { return pages; }
    public Date getDate() { return date; }
    public String getDoi() { return doi; }
    public int getCitations() { return citations; }
}
