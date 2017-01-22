package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * This adapter is specifically for the Word class and unique list_item view
 * that displays Miwok words and a translation
 */

public class WordAdapter extends ArrayAdapter {

    /*
     * basic constructor
     */
    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    /*
     * this override is called bye the list when it needs a new item
     * @param position is the position in the array
     * @param convertView is the recycled view element from the listView
     *  for us convertView is our layout list_item.xml
     * @param parent is the viewGroup (Listview), which holds it all
     *  for us parent is the ListView word_list   */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // ?Check if the view is being reused, otherwise inflate
        // no idea what inflate is
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Get the word at the position on the list
        Word currentWord = (Word) getItem(position);

        //Find the textview in the first slot, which is for Miwok
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        //Set the text to Miwok word
        miwokTextView.setText(currentWord.getMiwokTranslation());

        //Find the textview in the second slot, which is for Default
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        //Set the text to default word
        defaultTextView.setText(currentWord.getDefaultTranslation());


        //Find the imageview for the icon
        ImageView iconImageView = (ImageView) listItemView.findViewById(R.id.icon_image_view);
        //Check if there is an image, if none hide the image view
        if(currentWord.hasImage()) {
            //Set the source to image and set as visible
            iconImageView.setVisibility(View.VISIBLE);
            iconImageView.setImageResource(currentWord.getImageResourceID());
        }
        else{
            iconImageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
