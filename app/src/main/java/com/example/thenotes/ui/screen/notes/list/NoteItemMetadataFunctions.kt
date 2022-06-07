package com.example.thenotes.ui.screen.notes.list

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.thenotes.ui.screen.notes.list.ItemMetadata

@Composable
fun ItemMetaDataFunctions(metadata: String,modifier: Modifier){
    ConstraintLayout(
        modifier = modifier
    ) {
        val (metadataRef,functionsRef) = createRefs()
        ItemMetadata(
            metadata = metadata,
            modifier = Modifier
                .constrainAs(metadataRef){
                    start.linkTo(parent.start)
                }
        )
        //TODO add function items
    }
}