package university.interfaces;

import university.research.ResearchJournal;
import university.research.ResearchPaper;

public interface Subscribable {
    void subscribe(ResearchJournal journal);
    void unsubscribe(ResearchJournal journal);
    void onNewPaperPublished(ResearchPaper paper);
}
