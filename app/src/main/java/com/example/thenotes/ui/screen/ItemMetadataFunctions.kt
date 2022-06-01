package com.example.thenotes.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.constraintlayout.compose.ConstraintLayout

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