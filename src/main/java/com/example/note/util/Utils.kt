package com.example.note.util

import com.example.note.model.Page

fun sortByDate(list: List<Page>): List<Page>{
    return list.sortedByDescending { it.dateTimeCreat }
}