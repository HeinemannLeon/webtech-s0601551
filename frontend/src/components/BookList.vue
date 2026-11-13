<script setup lang="ts">
import { ref, onMounted } from 'vue'

interface Book {
  id: number
  title: string
  author: string
  genre: string
  currentPage: number
  totalPages: number
  status: string
}

const books = ref<Book[]>([])

onMounted(async () => {
  const response = await fetch('http://localhost:8080/PagePilot')
  books.value = await response.json()
})
</script>

<template>
  <h2><strong>Meine Bücher</strong></h2>
  <ul class="book-list">
    <li v-for="book in books" :key="book.id" class="book">
      <strong>{{ book.title }}</strong> von {{ book.author }}
      <span class="genre">{{ book.genre }}</span>
      – Seite {{ book.currentPage }} / {{ book.totalPages }}
      <span class="status" :class="book.status.replace(' ', '-')">
        {{ book.status }}
      </span>
    </li>
  </ul>
</template>

<style scoped>
strong { font-weight: bold; }
.book-list { list-style: none; padding: 0; min-width: 700px; }
.book { padding: 8px 12px; margin-bottom: 8px; border: 1px solid #ddd; border-radius: 6px; }

.status { margin-left: 8px; padding: 2px 8px; border-radius: 12px; font-size: 0.85em; }
.ungelesen    { background: #eee;    color: #555; }
.wird-gelesen { background: #fff3cd; color: #856404; }
.beendet      { background: #d4edda; color: #155724; }

.genre
{ margin-left: 8px; padding: 2px 8px; border-radius: 5px; font-size: 0.85em; background: #EDE7F6; color: #4A3B78; }
</style>