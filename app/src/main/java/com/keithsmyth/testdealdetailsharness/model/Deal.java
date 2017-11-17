package com.keithsmyth.testdealdetailsharness.model;

public class Deal {
    public String title;
    public String about;
    public String finePrint;

    public static Deal create() {
        Deal deal = new Deal();
        deal.title = "This is a great deal title, golly gosh!";
        deal.about =
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam eu sollicitudin nisi, in faucibus dolor. Donec sit amet venenatis augue, id malesuada ligula. In auctor mattis dolor, sed fermentum ipsum semper a. Integer volutpat mauris tempor tellus sodales dapibus. Etiam id dui sed augue sollicitudin placerat id eget risus. Phasellus non malesuada turpis, at dapibus est. Quisque porta ipsum et quam tempor iaculis. Vestibulum ut fringilla lacus. Sed at pharetra lorem. Phasellus et turpis a turpis pellentesque semper. Aenean eu urna at ligula facilisis ultricies. Integer quam urna, tempor sed sem sed, feugiat fermentum ligula. Fusce bibendum fringilla massa, et sollicitudin metus varius eget. Nullam aliquam diam mi, sed vulputate nibh convallis efficitur.\n"
                + "\n"
                + "Cras sit amet nunc mauris. Duis enim lorem, maximus sit amet pretium vitae, mattis nec nulla. Morbi ut risus mollis, ultrices ipsum sit amet, molestie libero. Maecenas gravida maximus dui, quis lobortis metus varius non. Vivamus varius magna in turpis vulputate vulputate. Sed id pulvinar nisi. Praesent ac dapibus nisl. In lacus nisi, pharetra nec mauris ac, feugiat convallis erat. Praesent eu tristique lorem. Sed ut imperdiet sem. Duis dui felis, congue sed ipsum et, sagittis venenatis lorem. Fusce auctor tellus sed blandit eleifend.\n"
                + "\n"
                + "Duis faucibus convallis facilisis. Donec orci nunc, tincidunt sed hendrerit eu, pretium nec lorem. Maecenas venenatis imperdiet lectus eget condimentum. Donec scelerisque egestas mi, nec euismod metus pretium sed. Sed quis fringilla risus. Sed at eros quis enim malesuada consequat ut non leo. Mauris erat ligula, interdum et fringilla nec, hendrerit id tellus. Proin sit amet mauris nec lectus faucibus mollis laoreet a nunc. Phasellus eu gravida lorem. Nullam nunc enim, interdum id porttitor a, scelerisque eget erat. Etiam fermentum fringilla arcu vel sodales. Duis vitae eros rutrum, fringilla augue a, egestas urna.\n"
                + "\n"
                + "Duis felis massa, sagittis sed sodales nec, congue at orci. Donec mattis volutpat lectus, pharetra viverra arcu elementum quis. Nunc bibendum pellentesque sollicitudin. Phasellus id arcu auctor, ullamcorper risus vel, euismod tortor. Morbi dolor metus, porttitor mattis magna eu, ultrices imperdiet neque. Donec luctus purus ac viverra tristique. Vivamus quis congue velit. Nulla facilisi. Nam ullamcorper diam odio, et rhoncus tellus suscipit sed. Vivamus ac euismod elit.\n"
                + "\n"
                + "Quisque commodo nibh ante, ac scelerisque orci sodales non. Integer interdum in enim molestie rutrum. Donec tincidunt libero orci, at tempus ipsum luctus eu. Phasellus gravida auctor leo. Sed porta luctus hendrerit. Vivamus blandit sem in sapien dignissim tristique. Phasellus tempor tortor sem, accumsan sodales sem vulputate ac. Integer leo erat, semper non magna ut, congue ultricies tortor. Fusce molestie massa pretium lectus molestie placerat. Etiam dictum ut lorem at tempor. Cras ut euismod neque. Donec porttitor nulla in lectus egestas egestas.";
        deal.finePrint = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris tellus turpis, tincidunt sit amet aliquam sed, vehicula in nunc. Integer euismod lectus augue. Aenean erat nibh, suscipit a sem ac, fermentum fringilla est. Proin ut ex pharetra lacus scelerisque eleifend. Pellentesque ut arcu neque. Phasellus lacinia nibh ut nulla vulputate, vel porta lorem luctus. Duis ullamcorper vehicula elementum.";
        return deal;
    }
}
