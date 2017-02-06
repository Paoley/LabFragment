package com.pabloulloa.myapplicationfragment7;

import android.app.ListActivity;
import android.app.LoaderManager;
import android.content.Loader;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.SimpleCursorAdapter;

/**
 * Created by pabloulloa on 2017-02-06.
 */

public class ListViewLoader extends ListActivity
        implements LoaderManager.LoaderCallbacks<Cursor>
{
    //adapter to lod aray into list  data
    SimpleCursorAdapter mAdapter;
    //want to retrive from resoursces
    static final String[] PROJECTION = new String[] {ContactsContract.Data._ID,
            ContactsContract.Data.DISPLAY_NAME};
    static
    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }
}
