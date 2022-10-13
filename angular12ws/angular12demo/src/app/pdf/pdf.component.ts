import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import jsPDF from 'jspdf';
import autoTable from 'jspdf-autotable';

@Component({
  selector: 'app-pdf',
  templateUrl: './pdf.component.html',
  styleUrls: ['./pdf.component.css'],
})
//https://www.npmjs.com/package/jspdf-autotable
export class PdfComponent implements OnInit {
  constructor() {}

  ngOnInit(): void {}

  download() {
    let doc = new jsPDF('p', 'pt', 'a4');

    autoTable(doc, {
      //styles: { fillColor: [220, 220,220] },
      //columnStyles: { 0: { halign: 'center', fillColor: [0, 255, 0] } }, // Cells in first column centered and green
      margin: { top: 10 },
      html: '#pdfTable',
      theme: 'grid',
    });
    doc.save('tableToPdf.pdf');
  }
}
