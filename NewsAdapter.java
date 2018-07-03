package com.example.android.newsapps1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> newsList){
        super(context, 0, newsList);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        //SET Title
        TextView title_text_view = (TextView) listItemView.findViewById(R.id.title_text_view);
        String title = currentNews.getTitle();
        title_text_view.setText(title);

        //SET Section
        TextView section_text_view = (TextView) listItemView.findViewById(R.id.section_text_view);
        String section = currentNews.getSection();
        section_text_view.setText(section);

        //SET Date
        //Date dateObject = new Date(currentNews.getTimeInMilliseconds());

        TextView date = (TextView) listItemView.findViewById(R.id.date_text_view);
        // Format the date string (i.e. "Mar 3, 1984")
        String formattedDate = formatDate(currentNews.getTimeInMilliseconds()); //dataObject
        date.setText(formattedDate);

        // Find the TextView with view ID time
        TextView timeView = (TextView) listItemView.findViewById(R.id.time_text_view);
        // Format the time string (i.e. "4:30PM")
        String formattedTime = formatTime(currentNews.getTimeInMilliseconds());
        // Display the time of the current news in that TextView
        timeView.setText(formattedTime);

        //SET Author
        TextView author_text_view = listItemView.findViewById(R.id.author_text_view);
        String author = currentNews.getAuthor();
        author_text_view.setText(author);

        return listItemView;
    }

    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    private String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

}
